public class HighAchieverStudent {
    Student[] list = new Student[5];
    int idx;

    void add ( Student std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list already full-filled");
        }
    }
    void print () {
        for (Student s : list) {
            s.print();
            System.out.println("=======================================");
        }
    }

    void bubbleSort () {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length-i; j++) {
                if (list[j].gpa > list[j-1].gpa) {
                    Student tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }

    void insertSort (boolean asc) {
        int num = list.length;
        for (int i = 1; i < num; i++) {
            double switchkey = list[i].gpa;
            int j = i - 1;
            if (asc) {
                while (j >= 0 && list[i].gpa > switchkey) {
                    list[j + 1].gpa = list[j].gpa;
                    j = j - 1;
                }
                list[j + 1].gpa = switchkey;
            } else {
                while (j >= 0 && list[i].gpa < switchkey) {
                    list[j + 1].gpa = list[j].gpa;
                    j = j - 1;
                }
                list[j + 1].gpa = switchkey;
            }
        }
    }

    void selectionSort () {
        for (int i = 0; i < list.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j].gpa > list[idxMin].gpa) {
                    idxMin = j;
                }
            }

            Student tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

}
