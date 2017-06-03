package Programa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Treino {

    private List<Dorsal> dorsal;
    private List<Peitoral> peitoral;
    private List<Ombros> ombros;
    private List<MembrosInferiores> membrosInferiores;
    private List<Bicips> bicips;
    private List<Triceps> triceps;

    public Treino() {
        this.dorsal = new ArrayList<Dorsal>();
        this.peitoral = new ArrayList<Peitoral>();
        this.ombros = new ArrayList<Ombros>();
        this.membrosInferiores = new ArrayList<MembrosInferiores>();
        this.bicips = new ArrayList<Bicips>();
        this.triceps = new ArrayList<Triceps>();

    }

    public Treino(List<Dorsal> dorsal, List<Peitoral> peitoral, List<Ombros> ombros,
            List<MembrosInferiores> membrosInferiores, List<Bicips> bicips, List<Triceps> triceps) {
        super();
        this.dorsal = new ArrayList<Dorsal>();
        this.peitoral = new ArrayList<Peitoral>();
        this.ombros = new ArrayList<Ombros>();
        this.membrosInferiores = new ArrayList<MembrosInferiores>();
        this.bicips = new ArrayList<Bicips>();
        this.triceps = new ArrayList<Triceps>();
    }

    public String toString2() {
        int dn = 0;
        int pn = 0;
        int on = 0;
        int mn = 0;
        int bn = 0;
        int tn = 0;

        String dor = "Dorsal.\n";
        for (Dorsal d : this.dorsal) {
            dor += "(" + dn++ + ")" + d.getNomeExcercicio04() + "-" + d.getSerie04() + "-" + d.getRep04() + "-" + d.getCarga04() + ".\n";
        }
        String pei = "Peitoral.\n";
        for (Peitoral p : this.peitoral) {
            pei += "(" + pn++ + ")" + p.getNomeExcercicio03() + "-" + p.getSerie03() + "-" + p.getRep03() + "-" + p.getCarga03() + ".\n";
        }
        String omb = "Ombros.\n";
        for (Ombros o : this.ombros) {
            omb += "(" + on++ + ")" + o.getNomeExcercicio02() + "-" + o.getSerie02() + "-" + o.getRep02() + "-" + o.getCarga02() + ".\n";
        }
        String mem = "Membros Inferiores.\n";
        for (MembrosInferiores mf : this.membrosInferiores) {
            mem += "(" + mn++ + ")" + mf.getNomeExcercicio01() + "-" + mf.getSerie01() + "-" + mf.getRep01() + "-" + mf.getCarga01() + ".\n";
        }
        String bic = "Bicips.\n";
        for (Bicips bi : this.bicips) {
            bic += "(" + bn++ + ")" + bi.getNomeExcercicio05() + "-" + bi.getSerie05() + "-" + bi.getRep05() + "-" + bi.getCarga05() + ".\n";
        }
        String tri = "Triceps.\n";
        for (Triceps tr : this.triceps) {
            tri += "(" + tn++ + ")" + tr.getNomeExcercicio06() + "-" + tr.getSerie06() + "-" + tr.getRep06() + "-" + tr.getCarga06() + ".\n";
        }
        return "Treino.\n" + dor + "\n" + pei + "\n" + omb + "\n" + mem + "\n" + bic + "\n" + tri;
    }

    public boolean cadastroDorsal(Dorsal d) {
        for (Dorsal x : this.dorsal) {
            if (x.equals(d)) {

                return false;
            }
        }
        this.dorsal.add(d);

        return true;
    }

    public boolean removerDorsal(Dorsal d) {
        for (Dorsal x : this.dorsal) {
            if (x.equals(d)) {
                this.dorsal.remove(x);

                return true;
            }
        }

        return false;
    }

    public Dorsal pesquisarDorsal(String nome) {
        for (Dorsal x : this.dorsal) {
            if (x.getNomeExcercicio04().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    /////////////////////////////////////////////////////////////////////////////////
    public boolean cadastroPeitoral(Peitoral d) {
        for (Peitoral x : this.peitoral) {
            if (x.equals(d)) {

                return false;
            }
        }
        this.peitoral.add(d);

        return true;
    }

    public boolean removerPeitoral(Peitoral d) {
        for (Peitoral x : this.peitoral) {
            if (x.equals(d)) {
                this.peitoral.remove(x);

                return true;
            }
        }

        return false;
    }

    public Peitoral pesquisarPeitoral(String nome) {
        for (Peitoral x : this.peitoral) {
            if (x.getNomeExcercicio03().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    /////////////////////////////////////////////////////////////////////////////////
    public boolean cadastroOmbros(Ombros d) {
        for (Ombros x : this.ombros) {
            if (x.equals(d)) {

                return false;
            }
        }
        this.ombros.add(d);

        return true;
    }

    public boolean removerOmbros(Ombros d) {
        for (Ombros x : this.ombros) {
            if (x.equals(d)) {
                this.ombros.remove(x);

                return true;
            }
        }

        return false;
    }

    public Ombros pesquisarOmbros(String nome) {
        for (Ombros x : this.ombros) {
            if (x.getNomeExcercicio02().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    /////////////////////////////////////////////////////////////////////////////////
    public boolean cadastroMembrosInferiores(MembrosInferiores d) {
        for (MembrosInferiores x : this.membrosInferiores) {
            if (d.getNomeExcercicio01().equals(x.getNomeExcercicio01())) {

                return false;
            }
        }
        this.membrosInferiores.add(d);

        return true;
    }

    public boolean removerMembrosInferiores(String nome) {
        for (MembrosInferiores x : this.membrosInferiores) {
            if (x.getNomeExcercicio01().equals(nome)) {
                this.membrosInferiores.remove(x);

                return true;
            }
        }

        return false;
    }

    public MembrosInferiores pesquisarMembrosInferiores(String nome) {
        for (MembrosInferiores x : this.membrosInferiores) {
            if (x.getNomeExcercicio01().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    /////////////////////////////////////////////////////////////////////////////////
    public boolean cadastroBicips(Bicips d) {
        for (Bicips x : this.bicips) {
            if (x.equals(d)) {

                return false;
            }
        }
        this.bicips.add(d);

        return true;
    }

    public boolean removerBicips(Bicips d) {
        for (Bicips x : this.bicips) {
            if (x.equals(d)) {
                this.bicips.remove(x);

                return true;
            }
        }

        return false;
    }

    public Bicips pesquisarBicips(String nome) {
        for (Bicips x : this.bicips) {
            if (x.getNomeExcercicio05().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    /////////////////////////////////////////////////////////////////////////////////
    public boolean cadastroTriceps(Triceps d) {
        for (Triceps x : this.triceps) {
            if (x.equals(d)) {

                return false;
            }
        }
        this.triceps.add(d);

        return true;
    }

    public boolean removerTriceps(Triceps d) {
        for (Triceps x : this.triceps) {
            if (x.equals(d)) {
                this.triceps.remove(x);

                return true;
            }
        }

        return false;
    }

    public Triceps pesquisarTriceps(String nome) {
        for (Triceps x : this.triceps) {
            if (x.getNomeExcercicio06().equals(nome)) {

                return x;

            }
        }

        return null;

    }

    public List<Dorsal> getDorsal() {
        return dorsal;
    }

    public void setDorsal(List<Dorsal> dorsal) {
        this.dorsal = dorsal;
    }

    public List<Peitoral> getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(List<Peitoral> peitoral) {
        this.peitoral = peitoral;
    }

    public List<Ombros> getOmbros() {
        return ombros;
    }

    public void setOmbros(List<Ombros> ombros) {
        this.ombros = ombros;
    }

    public List<MembrosInferiores> getMembrosInferiores() {
        return this.membrosInferiores;
    }

    public void setMembrosInferiores(List<MembrosInferiores> membrosInferiores) {
        this.membrosInferiores = membrosInferiores;
    }

    public List<Bicips> getBicips() {
        return bicips;
    }

    public void setBicips(List<Bicips> bicips) {
        this.bicips = bicips;
    }

    public List<Triceps> getTriceps() {
        return triceps;
    }

    public void setTriceps(List<Triceps> triceps) {
        this.triceps = triceps;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bicips == null) ? 0 : bicips.hashCode());
        result = prime * result + ((dorsal == null) ? 0 : dorsal.hashCode());
        result = prime * result + ((membrosInferiores == null) ? 0 : membrosInferiores.hashCode());
        result = prime * result + ((ombros == null) ? 0 : ombros.hashCode());
        result = prime * result + ((peitoral == null) ? 0 : peitoral.hashCode());
        result = prime * result + ((triceps == null) ? 0 : triceps.hashCode());
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
        Treino other = (Treino) obj;
        if (bicips == null) {
            if (other.bicips != null) {
                return false;
            }
        } else if (!bicips.equals(other.bicips)) {
            return false;
        }
        if (dorsal == null) {
            if (other.dorsal != null) {
                return false;
            }
        } else if (!dorsal.equals(other.dorsal)) {
            return false;
        }
        if (membrosInferiores == null) {
            if (other.membrosInferiores != null) {
                return false;
            }
        } else if (!membrosInferiores.equals(other.membrosInferiores)) {
            return false;
        }
        if (ombros == null) {
            if (other.ombros != null) {
                return false;
            }
        } else if (!ombros.equals(other.ombros)) {
            return false;
        }
        if (peitoral == null) {
            if (other.peitoral != null) {
                return false;
            }
        } else if (!peitoral.equals(other.peitoral)) {
            return false;
        }
        if (triceps == null) {
            if (other.triceps != null) {
                return false;
            }
        } else if (!triceps.equals(other.triceps)) {
            return false;
        }
        return true;
    }

}
