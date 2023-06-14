package oop;

public class Prod {
    private int pid;
    private String pname;
    private String desc;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Prod [pid=" + pid + ", pname=" + pname + ", desc=" + desc + "]";
    }
}

class ProdTest{
 public static void main(String[] args) {
    Prod p1 =  new Prod();
    p1.setPid(112);
    p1.setPname("smartphone");
    p1.setDesc("A cutting edge smartphone!");

    System.out.println(p1);

    Prod p2 = new Prod();
    p2.setPid(122);
    p2.setPname("laptop");
    p2.setDesc("An advanced laptop!");

    System.out.println(p2);
 }
}





