import pandas as pd
import numpy as np
from sklearn.ensemble import RandomForestClassifier
import joblib

# Gerar dados sintéticos para treino (1000 empresas)
np.random.seed(42)
n = 1000

receita = np.random.uniform(100_000, 10_000_000, n)
divida = np.random.uniform(0, 5_000_000, n)
lucro = np.random.uniform(-1_000_000, 2_000_000, n)
tempo_mercado = np.random.randint(0, 30, n)

# Criar variável alvo (risco) baseada em regras lógicas
# Baixo risco: lucro > 0, divida/receita < 0.3, tempo > 2
# Alto risco: divida/receita > 0.7 ou lucro < 0
# Médio risco: resto
risco = []
for i in range(n):
    dl = divida[i] / max(receita[i], 1)
    if lucro[i] > 0 and dl < 0.3 and tempo_mercado[i] > 2:
        risco.append('baixo')
    elif dl > 0.7 or lucro[i] < 0:
        risco.append('alto')
    else:
        risco.append('medio')

# Mapear para números (0: baixo, 1: medio, 2: alto) para treinamento
mapa = {'baixo': 0, 'medio': 1, 'alto': 2}
y = np.array([mapa[r] for r in risco])

# Features
X = np.column_stack([receita, divida, lucro, tempo_mercado])

# Treinar RandomForest
model = RandomForestClassifier(n_estimators=50, random_state=42)
model.fit(X, y)

# Salvar modelo
joblib.dump(model, 'model.pkl')
print("Modelo treinado e salvo como model.pkl")