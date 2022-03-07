package FootballBetting.Database;

import FootballBetting.Database.Enums.PredictionEnum;

import javax.persistence.*;

@Entity
@Table
public class ResultPrediction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    PredictionEnum prediction;

    public ResultPrediction() {
    }

    public ResultPrediction(int id, PredictionEnum prediction) {
        this.id = id;
        this.prediction = prediction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PredictionEnum getPrediction() {
        return prediction;
    }

    public void setPrediction(PredictionEnum prediction) {
        this.prediction = prediction;
    }
}
