import java.util.*;
import java.util.Map.Entry;

public class JobApplication {
    private static Set<String> skills = new HashSet<>(Arrays.asList("Java", "HTML5", "CSS3"));
    private static Map<String, Set<String>> applicants = new HashMap<>();

    public static void main(String[] args) {
        //------Task1------//
        System.out.println("Task 1: create and show applicants");
        createApplicants();
        //------Task2------//
        System.out.println("Task 2: findApplicantsWithMatchSkills");
        findApplicantsWithMatchSkills();
        //------Task3------//
        System.out.println("Task 3: allApplicantsSkills");
        allApplicantsSkills();

        System.out.println("Challenge: findUniqueSkills");
        findUniqueSkills();

    }

    public static void createApplicants() {
        // เพิ่มข้อมูลผู้สมัครลงใน Map
        applicants.put("Peter", new HashSet<>(Arrays.asList("C++", "Ruby")));
        applicants.put("Aum", new HashSet<>(Arrays.asList("C#", "Java")));
        applicants.put("Tip", new HashSet<>(Arrays.asList("Java", "CSS3", "HTML5")));
        applicants.put("Jane", new HashSet<>(Arrays.asList("HTML5", "Ruby", "Java", "CSS3")));

        // แสดงข้อมูลผู้สมัครทั้งหมด
        for (Map.Entry<String, Set<String>> entry : applicants.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void findApplicantsWithMatchSkills() {
      
            for (Map.Entry<String, Set<String>> entry : applicants.entrySet()) {
                Set<String> applicantSkills = entry.getValue();
                if (applicantSkills.containsAll(skills)) {
                    System.out.println(entry.getKey() + " => " + applicantSkills);
            }
        }
        
    }

    public static void allApplicantsSkills() {
        Set<String> allSkills = new HashSet<>();
        for (Set<String> skillSet : applicants.values()) {
            allSkills.addAll(skillSet);
        }
        System.out.println("all applicants' skills " + allSkills);
    }
    public static void findUniqueSkills() {
        Map<String, String> skillOwner = new HashMap<>();
        Map<String, Integer> skillCount = new HashMap<>();
    
        // นับสกิลทั้งหมด
        for (Map.Entry<String, Set<String>> entry : applicants.entrySet()) {
            String name = entry.getKey();
            for (String skill : entry.getValue()) {
                skillCount.put(skill, skillCount.getOrDefault(skill, 0) + 1);
                skillOwner.putIfAbsent(skill, name);
            }
        }
    
        System.out.println("Unique Skills:");
        for (Map.Entry<String, Integer> entry : skillCount.entrySet()) {
            if (entry.getValue() == 1) {
                String skill = entry.getKey();
                String owner = skillOwner.get(skill);
                System.out.println(owner + " has unique skill: " + skill);
            }
        }
    }
    
    
}
