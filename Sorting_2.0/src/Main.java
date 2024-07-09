import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main
    {
        private static String staffFile = "data/staff.txt";
        private static String dateFormat = "dd.MM.yyyy";

        public static void main(String[] args)
        {
            ArrayList<Employee> staff = loadStaffFromFile();

            for (Employee emp : staff)
                System.out.println(emp);
            List <Employee> staff2 = staff.stream().filter(e->e.getSalary()>100000).collect(Collectors.toList());
            System.out.println("------------------");
            for (Employee emp : staff2)
                System.out.println(emp);
            System.out.println("------------------");
            staff.stream().filter(e->e.getSalary()>100000).min((x,y)->x.getName().compareTo(y.getName())).stream().forEach(System.out::println);
//            Collections.sort (staff, new Comp());
////            Collections.sort (staff);
//
//            Collections.sort(staff, (o1, o2) ->o1.getSalary().compareTo(o2.getSalary()));
//            {
//                if (o1.getSalary().compareTo(o2.getSalary()) == 1)
//                {
//                    return o1.getName().equals(o2.getName());
//                }
//            });
////            for (Employee emp : staff)
////                System.out.println(emp);
        }


//        static class Comp implements Comparator <Employee>
//        {
//
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int res;
//                res = o1.getSalary().compareTo(o2.getSalary());
//                if (res == 0)
//                    res = o1.getName().compareTo(o2.getName());
//                return res;
//            }
//        }

        private static ArrayList<Employee> loadStaffFromFile()
        {
            ArrayList<Employee> staff = new ArrayList<>();
            try
            {
                List<String> lines = Files.readAllLines(Paths.get(staffFile));
                for(String line : lines)
                {
                    String[] fragments = line.split("\t");
                    if(fragments.length != 3) {
                        System.out.println("Wrong line: " + line);
                        continue;
                    }
                    staff.add(new Employee(
                            fragments[0],
                            Integer.parseInt(fragments[1]),
                            (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                    ));
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return staff;
        }
        //

    }
