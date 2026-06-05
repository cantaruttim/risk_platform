from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
import joblib
import numpy as np

app = FastAPI(title="Company Credit Risk Classifier")

# Carregar modelo treinado
model = joblib.load("model.pkl")

class CompanyData(BaseModel):
    receita_anual: float
    divida_total: float
    lucro_liquido: float
    tempo_mercado: int

@app.post("/classify")
def classify(company: CompanyData):
    # Preparar features na mesma ordem do treino
    features = np.array([[company.receita_anual,
                          company.divida_total,
                          company.lucro_liquido,
                          company.tempo_mercado]])
    pred = model.predict(features)[0]
    # Mapear de volta para texto
    risco_map = {0: "baixo", 1: "medio", 2: "alto"}
    risco = risco_map[pred]
    # Opcional: probabilidades
    proba = model.predict_proba(features)[0].tolist()
    return {
        "risco_credito": risco,
        "probabilidades": {
            "baixo": proba[0],
            "medio": proba[1],
            "alto": proba[2]
        }
    }

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=8000)