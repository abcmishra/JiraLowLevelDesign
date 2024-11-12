public class FeatureTask extends Task{
    private String featureSummary;
    private ImpactLevel impactLevel;
    public FeatureTask(int id,String title,User creator,String featureSummary,ImpaactLevel impaactLevel){
        super(id,title,creator);
        this.featureSummary=featureSummary;
        this.impactLevel=impaactLevel;
    }
}
