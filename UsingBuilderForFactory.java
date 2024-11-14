public class FeatureTask extends Task {
    private int id;
    private ImpactLevel impactLevel;

    private FeatureTask(Builder builder) {
        super(builder.title, builder.creator);
        this.id = builder.id;
        this.impactLevel = builder.impactLevel;
    }

    public static class Builder {
        private int id;
        private String title;
        private User creator;
        private ImpactLevel impactLevel;

        public Builder(String title, User creator) {
            this.title = title;
            this.creator = creator;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder impactLevel(ImpactLevel impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }

        public FeatureTask build() {
            return new FeatureTask(this);
        }
    }
}


