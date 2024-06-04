/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author nam
 */
public class Add{
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String gender;
    private int age;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private double averageScore;
    private String rank;

    public Add (String name, String gender, int age, double mathScore, double physicsScore, double chemistryScore) {
        this.id = idCounter++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.averageScore = calculateAverage();
        this.rank = calculateRank();
    }

    private double calculateAverage() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }

    private String calculateRank() {
        if (averageScore >= 8) {
            return "Giỏi";
        } else if (averageScore >= 6.5) {
            return "Khá";
        } else if (averageScore >= 5) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public int getAge() { return age; }
    public double getMathScore() { return mathScore; }
    public double getPhysicsScore() { return physicsScore; }
    public double getChemistryScore() { return chemistryScore; }
    public double getAverageScore() { return averageScore; }
    public String getRank() { return rank; }
}

