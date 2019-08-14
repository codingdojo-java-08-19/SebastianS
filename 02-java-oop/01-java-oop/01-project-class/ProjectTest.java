class ProjectTest {
    public static void main(String[] args) {
        Project testProject1 = new Project();
        Project testProject2 = new Project("Second Test");
        Project testProject3 = new Project("Third Test", "Overloading");
        System.out.println(testProject1.getDescription());
        System.out.println(testProject1.getName());
        System.out.println(testProject2.getDescription());
        System.out.println(testProject2.getName());
        System.out.println(testProject3.getDescription());
        System.out.println(testProject3.getName());
        testProject1.setDescription("Testing for Set's Description");
        testProject1.setName("Testing for Set's Name");
        System.out.println(testProject1.getDescription());
        System.out.println(testProject1.getName());
        System.out.println(testProject1.elevatorPitch());
    }
}