package dto;

public class ProgramStatDTO {

    private String label; // Departemen / Bidang
    private int totalProgram;
    private int terlaksana;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getTotalProgram() {
        return totalProgram;
    }

    public void setTotalProgram(int totalProgram) {
        this.totalProgram = totalProgram;
    }

    public int getTerlaksana() {
        return terlaksana;
    }

    public void setTerlaksana(int terlaksana) {
        this.terlaksana = terlaksana;
    }

    // helper untuk JSP
    public int getPersentase() {
        if (totalProgram == 0) return 0;
        return (terlaksana * 100) / totalProgram;
    }
}
