package entity;

public class Mark {
    private int id;
    private Student student;
    private Term term;
    private Discepline discepline;
    private int mark;

    public Mark(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Discepline getDiscepline() {
        return discepline;
    }

    public void setDiscepline(Discepline discepline) {
        this.discepline = discepline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark mark1 = (Mark) o;

        if (id != mark1.id) return false;
        if (mark != mark1.mark) return false;
        if (student != null ? !student.equals(mark1.student) : mark1.student != null) return false;
        if (term != null ? !term.equals(mark1.term) : mark1.term != null) return false;
        return discepline != null ? discepline.equals(mark1.discepline) : mark1.discepline == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (discepline != null ? discepline.hashCode() : 0);
        result = 31 * result + mark;
        return result;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", student=" + student +
                ", term=" + term +
                ", discepline=" + discepline +
                ", mark=" + mark +
                '}';
    }

}
