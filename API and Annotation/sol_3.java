
// Example : Collection

// class Main {

//     public static void main(String[] args)

//     {

//         List<String> CompanyList = new ArrayList<>();

//         CompanyList.add("Google");

//         CompanyList.add("Apple");

//         CompanyList.add("Microsoft");

//         Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);

//         Collections.sort(CompanyList, com);

//         for (String name : CompanyList) {

//             System.out.println(name);

//         }

//     }

// }


// Example : Streams


// class Demo {

//     public static void main(String[] args)

//     {

//         List<String> CompanyList = new ArrayList<>();

//         CompanyList.add("Google");

//         CompanyList.add("Apple");

//         CompanyList.add("Microsoft");

//         CompanyList.stream().sorted().forEach(

//             System.out::println);

//     }

// }