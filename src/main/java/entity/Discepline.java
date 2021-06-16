package entity;

public class Discepline {
    private int id;
    private String discipline;
    private int status = 1;

    public Discepline(){

    }

    public Discepline(int id, String discipline){
        this.id = id;
        this.discipline = discipline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discepline)) return false;

        Discepline that = (Discepline) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        return discipline != null ? discipline.equals(that.discipline) : that.discipline == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

    @Override
    public String toString() {
        return "Discepline{" +
                "id=" + id +
                ", discipline='" + discipline + '\'' +
                ", status=" + status +
                '}';
    }
}
