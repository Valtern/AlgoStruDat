import java.util.Scanner;
public class SearchStudent {
    Students[] listStudent;
    int ind;
    Scanner inp = new Scanner(System.in);

    public void add(Students stnd) {
        if (ind < listStudent.length) {
            listStudent[ind] = stnd;
            ind++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void addData() {
        System.out.println("Input how many student do you have: ");
        int ind1 = inp.nextInt();
        listStudent = new Students[ind1];
    }

    public void display () {
        for (Students studen: listStudent) {
            studen.display();
            System.out.println("---------------------------------------");
        }
    }

    public int findSeqSearch (String search) {
        int pos = -1;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].name.equalsIgnoreCase(search)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    public int findBinarySearch (int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == listStudent[mid].nim) {
                return (mid);
            } else if (listStudent[mid].nim > search){
                return findBinarySearch(search, left, mid - 1);
            } else {
                return findBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void showPos (int trg, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + trg + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + trg + " is not found");
        }
    }
    public void showPosString (String trg, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + trg + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + trg + " is not found");
        }
    }

    public void showDataString (String trg, int pos) {
        if(pos != -1) {
            System.out.println("NIM \t : " + listStudent[pos].nim);
            System.out.println("Name \t : " + trg);
            System.out.println("Age \t : " + listStudent[pos].age);
            System.out.println("GPA \t : " + listStudent[pos].gpa);
        }
    }

    public void insertSort (boolean asc) {
        int num = listStudent.length;
        for (int i = 1; i < num; i++) {
            int switchkey = listStudent[i].nim;
            int j = i - 1;
            if (asc) {
                while (j >= 0 && listStudent[i].nim > switchkey) {
                    listStudent[j + 1].nim = listStudent[j].nim;
                    j = j - 1;
                }
                listStudent[j + 1].nim = switchkey;
            } else {
                while (j >= 0 && listStudent[i].nim < switchkey) {
                    listStudent[j + 1].nim = listStudent[j].nim;
                    j = j - 1;
                }
                listStudent[j + 1].nim = switchkey;
            }
        }
    }
    void insertionSort() {
        int n = listStudent.length;

        for (int i = 1; i < n; i++) {
            int key = listStudent[i].nim;
            int j = i - 1;

            while (j >= 0 && listStudent[j].nim > key) {
                listStudent[j + 1].nim = listStudent[j].nim;
                j--;
            }

            listStudent[j + 1].nim = key;
        }
    }
    public void showData (int trg, int pos) {
        if(pos != -1) {
            System.out.println("NIM \t : " + trg);
            System.out.println("Name \t : " + listStudent[pos].name);
            System.out.println("Age \t : " + listStudent[pos].age);
            System.out.println("GPA \t : " + listStudent[pos].gpa);
        }
    }
}
