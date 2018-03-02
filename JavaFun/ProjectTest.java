

class ProjectTest {
    public static void main(String[] args){
        Project project1 = new Project();
        Project one = new Project("One", "Number One Project");
        Project internet = new Project("The Internet", "Is a band that is really good!");
       
        //System.out.println(project1.elevatorPitch());
        //System.out.println(one.elevatorPitch());
        //System.out.println(internet.elevatorPitch());
        
        Portfolio p1 = new Portfolio();

        project.setName("First Project");
        project.setDescription("This was confusing");
        project.setInitialCost(250);
                
        portfolio.addProject(one);
        portfolio.addProject(internet);

        portfolio.showPortfolio();
        //p1.addProject(one);
        //p1.addProject(expensive);
    }
}