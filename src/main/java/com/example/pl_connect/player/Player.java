package com.example.pl_connect.player;

import jakarta.persistence.*;

@Entity
@Table(name = "playerInfo")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
    private String nation;
    private String role; 
    private Integer age;
    private Integer matchesPlayed; 
    private Integer innings; 
    private Double oversBowled; 
    private Double runsScored; 
    private Double wicketsTaken; 
    private Double catches; 
    private Double runOuts; 
    private Double strikeRate; 
    private Double economyRate; 
    private String team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String nation, String role, int age, int matchesPlayed, int innings, double oversBowled, double runsScored, double wicketsTaken, double catches, double runOuts, double strikeRate, double economyRate, String team) {
        this.name = name;
        this.nation = nation;
        this.role = role;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.innings = innings;
        this.oversBowled = oversBowled;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.catches = catches;
        this.runOuts = runOuts;
        this.strikeRate = strikeRate;
        this.economyRate = economyRate;
        this.team = team;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public double getOversBowled() {
        return oversBowled;
    }

    public void setOversBowled(double oversBowled) {
        this.oversBowled = oversBowled;
    }

    public double getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(double runsScored) {
        this.runsScored = runsScored;
    }

    public double getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(double wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public double getCatches() {
        return catches;
    }

    public void setCatches(double catches) {
        this.catches = catches;
    }

    public double getRunOuts() {
        return runOuts;
    }

    public void setRunOuts(double runOuts) {
        this.runOuts = runOuts;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public double getEconomyRate() {
        return economyRate;
    }

    public void setEconomyRate(double economyRate) {
        this.economyRate = economyRate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", innings=" + innings +
                ", oversBowled=" + oversBowled +
                ", runsScored=" + runsScored +
                ", wicketsTaken=" + wicketsTaken +
                ", catches=" + catches +
                ", runOuts=" + runOuts +
                ", strikeRate=" + strikeRate +
                ", economyRate=" + economyRate +
                ", team='" + team + '\'' +
                '}';
    }
}
