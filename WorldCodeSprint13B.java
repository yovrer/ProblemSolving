import java.io.*;
import java.util.*;

public class WorldCodeSprint13B {

    // Complete the membersInTheLargestGroups function below.
    static void membersInTheLargestGroups(int n, int m, int a, int b, int f, int s, int t)throws  Exception {
        // Print the names of the students in all largest groups or determine if there are no valid groups.

        HashMap<Integer, Group> groupsMap = new HashMap<>();

        HashMap<String, Student> studants = new HashMap<>();

        HashSet<Integer> allMam = new HashSet<>();

        StringTokenizer tokn;

        String studentName;

        int max = -1;

        int groupId = -1;

        int grade;

        int teams = 0;

        for (int i = 0; i < n; i++) {

            tokn = new StringTokenizer(scanner.readLine());

            studentName = tokn.nextToken();

            grade = Integer.parseInt(tokn.nextToken());

            studants.put(studentName, new Student(grade, studentName));
        }

        String studantA;

        String studantB;

        for (int i = 0; i < m; i++) {
            tokn = new StringTokenizer(scanner.readLine());

            studantA = tokn.nextToken();

            studantB = tokn.nextToken();

            if (studants.get(studantA).group == -1 && studants.get(studantB).group == -1){
                Group group = new Group();
                group.groupId =  ++teams;

                if (studantA.equals(studantB)) {
                    group.addOneStudant(studants.get(studantA), f, s, t, b);
                }else {
                    group.addStudant(studants.get(studantA), studants.get(studantB), f, s, t, b);
                }
                if (group.count > max){

                    max = group.count;
                    groupId = group.groupId;
                    allMam.clear();
                    allMam.add(group.groupId);
                } else if (group.count == max) {

                    allMam.add(group.groupId);
                }
                groupsMap.put(group.groupId, group);

            }else if(studants.get(studantA).group == -1 || studants.get(studantB).group == -1){
                Group group;
                Student target;
                if (studants.get(studantA).group == -1) {
                    group = groupsMap.get(studants.get(studantB).group);
                    target = studants.get(studantA);
                }else{
                    group = groupsMap.get(studants.get(studantA).group);
                    target = studants.get(studantB);
                }
                group.addOneStudant(target, f, s, t, b);
                if (group.count > max){

                    max = group.count;
                    groupId = group.groupId;
                    allMam.clear();
                    allMam.add(group.groupId);
                } else if (group.count == max) {

                    allMam.add(group.groupId);
                }
            }else if(studants.get(studantA).group != studants.get(studantB).group ){
                Group groupa = groupsMap.get(studants.get(studantA).group);
                Group groupb = groupsMap.get(studants.get(studantB).group);

                groupa.meargeGroup(groupb, studants, groupsMap, f, s, t, b);

                if (groupa.count > max){

                    max = groupa.count;
                    groupId = groupa.groupId;
                    allMam.clear();
                    allMam.add(groupa.groupId);
                } else if (groupa.count == max) {

                    allMam.add(groupa.groupId);
                }
            }

        }
        if (groupId != -1){

            if (max >= a){

                StringBuilder out = new StringBuilder();

                List<String> studantNames = new ArrayList<>();

                Group group;

                for (int v: allMam) {

                    group = groupsMap.get(v);

                    studantNames.addAll(group.groupMembers);

                }
                Collections.sort(studantNames);
                for (String studantName: studantNames) {
                    out.append(studantName).append("\n");
                }
                System.out.println(out.toString().trim());

            }else{
                System.out.println("no groups");
            }


        }


    }

    private static final BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws Exception {

        String[] nmabfst = scanner.readLine().split(" ");

        int n = Integer.parseInt(nmabfst[0]);

        int m = Integer.parseInt(nmabfst[1]);

        int a = Integer.parseInt(nmabfst[2]);

        int b = Integer.parseInt(nmabfst[3]);

        int f = Integer.parseInt(nmabfst[4]);

        int s = Integer.parseInt(nmabfst[5]);

        int t = Integer.parseInt(nmabfst[6]);

        membersInTheLargestGroups(n, m, a, b, f, s, t);

        scanner.close();
    }
}

class Group implements Comparable<Group>{

    int count;

    int first;

    int second;

    int theard;

    int groupId;

    List<String> groupMembers;

    public  Group(){

        groupMembers = new ArrayList<>();
    }

    public void addStudant(Student student1 ,Student student2, int maxFirst, int maxSecand, int maxTheard, int maxGroupSize){
        int copyOfFirst = first;
        int copyOfSecand = second;
        int copyOfTherd = theard;

        if (student1.grade == 1){
            copyOfFirst++;
        }else if (student1.grade == 2){
            copyOfSecand++;
        }else{
            copyOfTherd++;
        }

        if (student2.grade == 1){
            copyOfFirst++;
        }else if (student2.grade == 2){
            copyOfSecand++;
        }else{
            copyOfTherd++;
        }

        if (copyOfFirst <= maxFirst && copyOfSecand <= maxSecand && copyOfTherd <= maxTheard && count + 2 <= maxGroupSize){
            first = copyOfFirst;
            second = copyOfSecand;
            theard = copyOfTherd;
            count+=2;
            groupMembers.add(student1.name);
            groupMembers.add(student2.name);
            student1.group = groupId;
            student2.group = groupId;
        }


    }

    public void addOneStudant(Student student1 , int maxFirst, int maxSecand, int maxTheard, int maxGroupSize){
        int copyOfFirst = first;
        int copyOfSecand = second;
        int copyOfTherd = theard;

        if (student1.grade == 1){
            copyOfFirst++;
        }else if (student1.grade == 2){
            copyOfSecand++;
        }else{
            copyOfTherd++;
        }

        if (copyOfFirst <= maxFirst && copyOfSecand <= maxSecand && copyOfTherd <= maxTheard && count+1 <= maxGroupSize){
            first = copyOfFirst;
            second = copyOfSecand;
            theard = copyOfTherd;
            count+=1;
            groupMembers.add(student1.name);
            student1.group = groupId;
        }
    }

    public void meargeGroup(Group group, HashMap<String, Student> studants,  HashMap<Integer, Group> groupsMap,int maxFirst, int maxSecand, int maxTheard, int maxGroupSize){
        int copyOfFirst = first + group.first;
        int copyOfSecand = second +  group.second;
        int copyOfTherd = theard + group .theard;
        int copyOfcount = count + group.count;
        if (copyOfFirst <= maxFirst && copyOfSecand <= maxSecand && copyOfTherd <= maxTheard && copyOfcount <= maxGroupSize){
            first = copyOfFirst;
            second = copyOfSecand;
            theard = copyOfTherd;
            count = copyOfcount;
            groupMembers.addAll(group.groupMembers);
            for (String name: group.groupMembers) {
                studants.get(name).group = groupId;
            }
        }
    }

    @Override
    public int compareTo(Group group) {
        return this.count - group.count;
    }
}


class Student {

    int group;

    int grade;

    String name;

    public Student(int grade,String name){

        this.grade = grade;

        group = -1;

        this.name = name;
    }
}