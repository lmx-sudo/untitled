package Exe4_1;
class student {
        private String no;
        private String name;
        private String age;
        private String gender;
        student() {
        }
        public student(String no, String name, String age, String gender) {
            this.no = no;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public static void main(String args[]) {
        }
}
