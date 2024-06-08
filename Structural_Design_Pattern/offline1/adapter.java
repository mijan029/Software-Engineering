public class adapter {
    private String message;
    public adapter(String message){
        this.message = message;
    }
    public adapter(){
    }
    public void send(String message){
        this.message = message;
        disguiseCrewmate crewmate = new disguiseCrewmate("I am a good crewmate :) ");
        crewmate.action();
    }
}
