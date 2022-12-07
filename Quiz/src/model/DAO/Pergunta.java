
package model.DAO;


public class Pergunta {
    private int id;
    private String titulo;
    private String alternativa_a;
    private String alternativa_b;
    private String alternativa_c;
    private String alternativa_d;
    private String area;
    private String dificuldade;
    private String resposta_certa;

    public Pergunta(int id, String titulo, String alternativa_a, String alternativa_b, String alternativa_c, String alternativa_d, String area, String dificuldade, String resposta_certa) {
        this.id = id;
        this.titulo = titulo;
        this.alternativa_a = alternativa_a;
        this.alternativa_b = alternativa_b;
        this.alternativa_c = alternativa_c;
        this.alternativa_d = alternativa_d;
        this.area = area;
        this.dificuldade = dificuldade;
        this.resposta_certa = resposta_certa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlternativa_a() {
        return alternativa_a;
    }

    public void setAlternativa_a(String alternativa_a) {
        this.alternativa_a = alternativa_a;
    }

    public String getAlternativa_b() {
        return alternativa_b;
    }

    public void setAlternativa_b(String alternativa_b) {
        this.alternativa_b = alternativa_b;
    }

    public String getAlternativa_c() {
        return alternativa_c;
    }

    public void setAlternativa_c(String alternativa_c) {
        this.alternativa_c = alternativa_c;
    }

    public String getAlternativa_d() {
        return alternativa_d;
    }

    public void setAlternativa_d(String alternativa_d) {
        this.alternativa_d = alternativa_d;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getResposta_certa() {
        return resposta_certa;
    }

    public void setResposta_certa(String resposta_certa) {
        this.resposta_certa = resposta_certa;
    }
    
    
        
}
