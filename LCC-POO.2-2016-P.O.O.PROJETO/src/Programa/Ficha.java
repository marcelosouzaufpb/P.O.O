package Programa;

public class Ficha {

    private String subescapular;
    private String biciptal;
    private String triciptal;
    private String axiliarMedida;
    private String peitoral;
    private String abdominal;
    private String coxa;
    private String panturrilha;
    private String supraIliaca;
    private String pesoResidual;
    private String pesoOsseo;
    private String pesoMuscular;
    private String gorduraAtual;
    private String gorduraIdeal;
    private String pesoGordo;
    private String pesoMagro;
    private String pesoIdeal;
    private String biestioide;
    private String biepicondilo;
    private String femural;
    private String altura;
    private String pesoAtual;
    private String imc;
    private String idade;
    private String sexo;

    public Ficha() {
        super();
        this.subescapular = "";
        this.biciptal = "";
        this.triciptal = "";
        this.axiliarMedida = "";
        this.peitoral = "";
        this.abdominal = "";
        this.coxa = "";
        this.panturrilha = "";
        this.supraIliaca = "";
        this.pesoResidual = "";
        this.pesoOsseo = "";
        this.pesoMuscular = "";
        this.gorduraAtual = "";
        this.gorduraIdeal = "";
        this.pesoGordo = "";
        this.pesoMagro = "";
        this.pesoIdeal = "";
        this.biestioide = "";
        this.biepicondilo = "";
        this.femural = "";
        this.altura = "";
        this.pesoAtual = "";
        this.imc = "";
        this.idade = "";
        this.sexo = "";

    }

    public Ficha(String subescapular, String biciptal, String triciptal, String axiliarMedida, String peitoral,
            String abdominal, String coxa, String panturrilha, String supraIliaca, String pesoResidual,
            String pesoOsseo, String pesoMuscular, String gorduraAtual, String gorduraIdeal, String pesoGordo,
            String pesoMagro, String pesoIdeal, String biestioide, String biepicondilo, String femural, String altura,
            String pesoAtual, String imc, String idade, String sexo) {
        super();
        this.subescapular = subescapular;
        this.biciptal = biciptal;
        this.triciptal = triciptal;
        this.axiliarMedida = axiliarMedida;
        this.peitoral = peitoral;
        this.abdominal = abdominal;
        this.coxa = coxa;
        this.panturrilha = panturrilha;
        this.supraIliaca = supraIliaca;
        this.pesoResidual = pesoResidual;
        this.pesoOsseo = pesoOsseo;
        this.pesoMuscular = pesoMuscular;
        this.gorduraAtual = gorduraAtual;
        this.gorduraIdeal = gorduraIdeal;
        this.pesoGordo = pesoGordo;
        this.pesoMagro = pesoMagro;
        this.pesoIdeal = pesoIdeal;
        this.biestioide = biestioide;
        this.biepicondilo = biepicondilo;
        this.femural = femural;
        this.altura = altura;
        this.pesoAtual = pesoAtual;
        this.imc = imc;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String toString2() {
        return "Dados Corporai.\n\n" + "Medidas Gerais.\n" + "[Altura] - " + this.altura + ".\n" + "[Pesso Atual] -"
                + this.pesoAtual + ".\n" + "[IMC] -" + this.imc + ".\n" + "[Idade] -" + this.idade + ".\n" + "[Sexo] -"
                + this.sexo + ".\n" + "Medidas Secundarias" + ".\n\n" + "[Subescapular] -" + this.subescapular + ".\n"
                + "[Biciptal] -" + this.biciptal + ".\n" + "[Axiliar - Media] -" + this.axiliarMedida + ".\n"
                + "[Triciptal] -" + this.triciptal + ".\n" + "[Peitoral] -" + this.peitoral + ".\n" + "[Abdominal] -"
                + this.abdominal + ".\n" + "[Coxa] -" + this.coxa + ".\n" + "[Panturrilha] -" + this.panturrilha + ".\n"
                + "[Supra-Iliaca] -" + this.supraIliaca + ".\n" + "Peso.\n\n" + "[Peso Residual] -" + this.pesoResidual
                + ".\n" + "[Peso Osseo] -" + this.pesoOsseo + ".\n" + "[Peso Muscular] -" + this.pesoMuscular + ".\n"
                + "[Gordura Atual] -" + this.gorduraAtual + ".\n" + "[Gordura Ideal] -" + this.gorduraIdeal + ".\n"
                + "[Pesso Gordo] -" + this.pesoGordo + ".\n" + "[Peso Magro] -" + this.pesoMagro + ".\n"
                + "[Peso Ideal] -" + this.pesoIdeal + ".\n" + "Diametros" + ".\n\n" + "[Biestiolde] -" + this.biestioide
                + ".\n" + "[Biepicondilo] -" + this.biepicondilo + ".\n" + "[Femural] -" + this.femural + ".\n";
    }

    public String getSubescapular() {
        return subescapular;
    }

    public void setSubescapular(String subescapular) {
        this.subescapular = subescapular;
    }

    public String getBiciptal() {
        return biciptal;
    }

    public void setBiciptal(String biciptal) {
        this.biciptal = biciptal;
    }

    public String getTriciptal() {
        return triciptal;
    }

    public void setTriciptal(String triciptal) {
        this.triciptal = triciptal;
    }

    public String getAxiliarMedida() {
        return axiliarMedida;
    }

    public void setAxiliarMedida(String axiliarMedida) {
        this.axiliarMedida = axiliarMedida;
    }

    public String getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(String peitoral) {
        this.peitoral = peitoral;
    }

    public String getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(String abdominal) {
        this.abdominal = abdominal;
    }

    public String getCoxa() {
        return coxa;
    }

    public void setCoxa(String coxa) {
        this.coxa = coxa;
    }

    public String getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(String panturrilha) {
        this.panturrilha = panturrilha;
    }

    public String getSupraIliaca() {
        return supraIliaca;
    }

    public void setSupraIliaca(String supraIliaca) {
        this.supraIliaca = supraIliaca;
    }

    public String getPesoResidual() {
        return pesoResidual;
    }

    public void setPesoResidual(String pesoResidual) {
        this.pesoResidual = pesoResidual;
    }

    public String getPesoOsseo() {
        return pesoOsseo;
    }

    public void setPesoOsseo(String pesoOsseo) {
        this.pesoOsseo = pesoOsseo;
    }

    public String getPesoMuscular() {
        return pesoMuscular;
    }

    public void setPesoMuscular(String pesoMuscular) {
        this.pesoMuscular = pesoMuscular;
    }

    public String getGorduraAtual() {
        return gorduraAtual;
    }

    public void setGorduraAtual(String gorduraAtual) {
        this.gorduraAtual = gorduraAtual;
    }

    public String getGorduraIdeal() {
        return gorduraIdeal;
    }

    public void setGorduraIdeal(String gorduraIdeal) {
        this.gorduraIdeal = gorduraIdeal;
    }

    public String getPesoGordo() {
        return pesoGordo;
    }

    public void setPesoGordo(String pesoGordo) {
        this.pesoGordo = pesoGordo;
    }

    public String getPesoMagro() {
        return pesoMagro;
    }

    public void setPesoMagro(String pesoMagro) {
        this.pesoMagro = pesoMagro;
    }

    public String getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(String pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String getBiestioide() {
        return biestioide;
    }

    public void setBiestioide(String biestioide) {
        this.biestioide = biestioide;
    }

    public String getBiepicondilo() {
        return biepicondilo;
    }

    public void setBiepicondilo(String biepicondilo) {
        this.biepicondilo = biepicondilo;
    }

    public String getFemural() {
        return femural;
    }

    public void setFemural(String femural) {
        this.femural = femural;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(String pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((abdominal == null) ? 0 : abdominal.hashCode());
        result = prime * result + ((altura == null) ? 0 : altura.hashCode());
        result = prime * result + ((axiliarMedida == null) ? 0 : axiliarMedida.hashCode());
        result = prime * result + ((biciptal == null) ? 0 : biciptal.hashCode());
        result = prime * result + ((biepicondilo == null) ? 0 : biepicondilo.hashCode());
        result = prime * result + ((biestioide == null) ? 0 : biestioide.hashCode());
        result = prime * result + ((coxa == null) ? 0 : coxa.hashCode());
        result = prime * result + ((femural == null) ? 0 : femural.hashCode());
        result = prime * result + ((gorduraAtual == null) ? 0 : gorduraAtual.hashCode());
        result = prime * result + ((gorduraIdeal == null) ? 0 : gorduraIdeal.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((imc == null) ? 0 : imc.hashCode());
        result = prime * result + ((panturrilha == null) ? 0 : panturrilha.hashCode());
        result = prime * result + ((peitoral == null) ? 0 : peitoral.hashCode());
        result = prime * result + ((pesoAtual == null) ? 0 : pesoAtual.hashCode());
        result = prime * result + ((pesoGordo == null) ? 0 : pesoGordo.hashCode());
        result = prime * result + ((pesoIdeal == null) ? 0 : pesoIdeal.hashCode());
        result = prime * result + ((pesoMagro == null) ? 0 : pesoMagro.hashCode());
        result = prime * result + ((pesoMuscular == null) ? 0 : pesoMuscular.hashCode());
        result = prime * result + ((pesoOsseo == null) ? 0 : pesoOsseo.hashCode());
        result = prime * result + ((pesoResidual == null) ? 0 : pesoResidual.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        result = prime * result + ((subescapular == null) ? 0 : subescapular.hashCode());
        result = prime * result + ((supraIliaca == null) ? 0 : supraIliaca.hashCode());
        result = prime * result + ((triciptal == null) ? 0 : triciptal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ficha other = (Ficha) obj;
        if (abdominal == null) {
            if (other.abdominal != null) {
                return false;
            }
        } else if (!abdominal.equals(other.abdominal)) {
            return false;
        }
        if (altura == null) {
            if (other.altura != null) {
                return false;
            }
        } else if (!altura.equals(other.altura)) {
            return false;
        }
        if (axiliarMedida == null) {
            if (other.axiliarMedida != null) {
                return false;
            }
        } else if (!axiliarMedida.equals(other.axiliarMedida)) {
            return false;
        }
        if (biciptal == null) {
            if (other.biciptal != null) {
                return false;
            }
        } else if (!biciptal.equals(other.biciptal)) {
            return false;
        }
        if (biepicondilo == null) {
            if (other.biepicondilo != null) {
                return false;
            }
        } else if (!biepicondilo.equals(other.biepicondilo)) {
            return false;
        }
        if (biestioide == null) {
            if (other.biestioide != null) {
                return false;
            }
        } else if (!biestioide.equals(other.biestioide)) {
            return false;
        }
        if (coxa == null) {
            if (other.coxa != null) {
                return false;
            }
        } else if (!coxa.equals(other.coxa)) {
            return false;
        }
        if (femural == null) {
            if (other.femural != null) {
                return false;
            }
        } else if (!femural.equals(other.femural)) {
            return false;
        }
        if (gorduraAtual == null) {
            if (other.gorduraAtual != null) {
                return false;
            }
        } else if (!gorduraAtual.equals(other.gorduraAtual)) {
            return false;
        }
        if (gorduraIdeal == null) {
            if (other.gorduraIdeal != null) {
                return false;
            }
        } else if (!gorduraIdeal.equals(other.gorduraIdeal)) {
            return false;
        }
        if (idade == null) {
            if (other.idade != null) {
                return false;
            }
        } else if (!idade.equals(other.idade)) {
            return false;
        }
        if (imc == null) {
            if (other.imc != null) {
                return false;
            }
        } else if (!imc.equals(other.imc)) {
            return false;
        }
        if (panturrilha == null) {
            if (other.panturrilha != null) {
                return false;
            }
        } else if (!panturrilha.equals(other.panturrilha)) {
            return false;
        }
        if (peitoral == null) {
            if (other.peitoral != null) {
                return false;
            }
        } else if (!peitoral.equals(other.peitoral)) {
            return false;
        }
        if (pesoAtual == null) {
            if (other.pesoAtual != null) {
                return false;
            }
        } else if (!pesoAtual.equals(other.pesoAtual)) {
            return false;
        }
        if (pesoGordo == null) {
            if (other.pesoGordo != null) {
                return false;
            }
        } else if (!pesoGordo.equals(other.pesoGordo)) {
            return false;
        }
        if (pesoIdeal == null) {
            if (other.pesoIdeal != null) {
                return false;
            }
        } else if (!pesoIdeal.equals(other.pesoIdeal)) {
            return false;
        }
        if (pesoMagro == null) {
            if (other.pesoMagro != null) {
                return false;
            }
        } else if (!pesoMagro.equals(other.pesoMagro)) {
            return false;
        }
        if (pesoMuscular == null) {
            if (other.pesoMuscular != null) {
                return false;
            }
        } else if (!pesoMuscular.equals(other.pesoMuscular)) {
            return false;
        }
        if (pesoOsseo == null) {
            if (other.pesoOsseo != null) {
                return false;
            }
        } else if (!pesoOsseo.equals(other.pesoOsseo)) {
            return false;
        }
        if (pesoResidual == null) {
            if (other.pesoResidual != null) {
                return false;
            }
        } else if (!pesoResidual.equals(other.pesoResidual)) {
            return false;
        }
        if (sexo == null) {
            if (other.sexo != null) {
                return false;
            }
        } else if (!sexo.equals(other.sexo)) {
            return false;
        }
        if (subescapular == null) {
            if (other.subescapular != null) {
                return false;
            }
        } else if (!subescapular.equals(other.subescapular)) {
            return false;
        }
        if (supraIliaca == null) {
            if (other.supraIliaca != null) {
                return false;
            }
        } else if (!supraIliaca.equals(other.supraIliaca)) {
            return false;
        }
        if (triciptal == null) {
            if (other.triciptal != null) {
                return false;
            }
        } else if (!triciptal.equals(other.triciptal)) {
            return false;
        }
        return true;
    }

}
