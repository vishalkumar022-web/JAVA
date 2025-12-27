package Encapsulation;

public class Qno5 {

        // Private fields
        private String name;
        private int rollNumber;
        private double mathGrade;
        private double scienceGrade;
        private double englishGrade;

        // Constructor
        public Qno5(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.mathGrade = 0;
            this.scienceGrade = 0;
            this.englishGrade = 0;

        }


        // Setter methods (validate 0–100)
        public void setMathGrade(double mathGrade) {
            if (mathGrade >= 0 && mathGrade <= 100) {
                this.mathGrade = mathGrade;
            } else {
                System.out.println("Invalid math grade!");
            }
        }

        public void setScienceGrade(double scienceGrade) {
            if (scienceGrade >= 0 && scienceGrade <= 100) {
                this.scienceGrade = scienceGrade;
            } else {
                System.out.println("Invalid science grade!");
            }
        }

        public void setEnglishGrade(double englishGrade) {
            if (englishGrade >= 0 && englishGrade <= 100) {
                this.englishGrade = englishGrade;
            } else {
                System.out.println("Invalid english grade!");
            }
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public double getMathGrade() {
            return mathGrade;
        }

        public double getScienceGrade() {
            return scienceGrade;
        }

        public double getEnglishGrade() {
            return englishGrade;
        }

        // Calculate average grade
        public double getAverageGrade() {
            return (mathGrade + scienceGrade + englishGrade) / 3.0;
        }

        // Determine letter grade
        public String getLetterGrade() {


            double avg = getAverageGrade();

            if (avg >= 90 && avg <= 100) {
                return "A";
            } else if (avg >= 80 && avg <= 89) {
                return "B";
            } else if (avg >= 70 && avg <= 79) {
                return "C";
            } else if (avg >= 60 && avg <= 69) {
                return "D";
            } else {
                return "F";
            }
        }
    }


class studentTest{
    public static void main(String[] args) {
        Qno5 obj = new Qno5("Raj",23);
        System.out.println(obj.getEnglishGrade());
        System.out.println(obj.getMathGrade());
        System.out.println(obj.getScienceGrade());


        obj.setMathGrade(100);
        obj.setEnglishGrade(85);
        obj.setScienceGrade(92);


        System.out.println(obj.getName());
        System.out.println(obj.getRollNumber());
        System.out.println(obj.getEnglishGrade());
        System.out.println(obj.getMathGrade());
        System.out.println(obj.getScienceGrade());

        System.out.println(obj.getAverageGrade());
        System.out.println(obj.getLetterGrade());
    }
}









