package DesignPatterns.Builder;

class Employee {

    private String name ;

    private int age;
    private int yearsofexp;
    private String designation;
    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.age=employeeBuilder.age;
        this.yearsofexp=employeeBuilder.yearsofexp;
        this.designation=employeeBuilder.designation;
    }
    static public EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getYearsofexp() {
        return yearsofexp;
    }
    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearsofexp=" + yearsofexp +
                ", designation='" + designation + '\'' +
                '}';
    }

    static class EmployeeBuilder{
        String name;
        int age;
        int yearsofexp;
        String designation;

        public EmployeeBuilder name(String name){
            this.name = name;
            return  this;
        }
        public EmployeeBuilder age(int age){
            this.age = age;
            return this;
        }
        public EmployeeBuilder yearsofExp(int yearsofexp){
            this.yearsofexp = yearsofexp;
            return this;
        }
        public EmployeeBuilder designation(String designation){
            this.designation=designation;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }


}
