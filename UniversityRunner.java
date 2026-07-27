class UniversityRunner {

    public static void main(String[] args) {

        String[] courses = University.getCoursesByCollegeName("RVCE");

        if(courses != null) {
            for(String course : courses) {
                System.out.println(course);
            }
        }
        else {
            System.out.println("College Not Found");
        }
    }
}