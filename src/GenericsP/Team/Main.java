package GenericsP.Team;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {

}

record FootBallPlayer(String name, String position) implements Player {

}

record VolleyBallPlayer(String name, String position) implements Player {

}

public class Main {
    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 2, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 2, astros2, 5);

        Team<BaseballPlayer, Affiliation> phillies = new Team("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team("Houston Astros");
        scoreResult(phillies, 2, astros, 5);


        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        var jack = new BaseballPlayer("jack", "Center Fielder");
        phillies.addTeamMember(jack);
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();


        SportsTeam afc1 = new SportsTeam("Adelaide Crows");

        Team<FootBallPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaide, South Australia, in AU");
        var tex = new FootBallPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootBallPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyBallPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyBallPlayer("N Roberts", "setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyBallPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyBallPlayer("B Black", "foward"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

//        Team <Integer> melbourneVB=new Team<>("Melbourne Vipers");

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
