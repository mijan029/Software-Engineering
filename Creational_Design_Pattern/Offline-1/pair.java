public class pair{
    private components cmp;
    private String type;
    public pair(components cmp, String type){
        this.cmp = cmp;
        this.type = type;
    }
    public components getFirst(){
        return cmp;
    }

    public String getSecond(){
        return type;
    }
}
