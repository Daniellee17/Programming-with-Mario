package com.example.daniellemarie.androidproject;


public class questions{


    public String mQuestions[] = {
            "Mario barely knows anything about Java. How will you describe it to him?",
            "Mario is getting curious which of the following group consists of only Object-Oriented languages?",
            "Mario just used this function but isn’t sure what will the function Math.ceil(-99.9) return?",
            "Mario is wondering which is actually right?",
            "Mario is getting worried when he is experiencing method overloading. Which of the following statement is true regarding method overloading?",
            "Mario is asking you to choose the correct option:",
            "Which statement is true for the class java.util.ArrayList?",
            "Mario is wondering if HashMap is a Collection class.",
            "Mario is asking which of these statements make logical sense",
            "Mario wants to use map interface however he doesn’t know how to use it. Which of the following is an implementation of Map interface:",
            "Mario is asking which of the following datatype’s display format is YYYY-MM-DD HH:MM:SS",
            "Mario is wondering which of the following is correct command to connect to MySQL form command line?",
            "Mario is trying to view the structure of the table. Which of the following command is used to view the structure of a table?",
            "Mario wants to calculate the average of something. If a MySQL AVG() function does not find a matching row, what it will return?",
            "Mario just used the command MySQL COUNT() function , however he forgot what this command returns",
            "Mario asks Which one of the following denotes the default mysql date format?",
            "Mario wonders which of the following is not a MySQL CONSTRAINT?",
            "Mario has forgotten how many expressions are taken by MySQL IF()",
            "Mario forget which year was MySQL invented and he asks which year was it",
            "Mario just created a table and he wonders if a table can have more than 1 primary key?",
            "Mario barely knows anything about Java. How will you describe it to him?",
            "Mario is getting curious which of the following group consists of only Object-Oriented languages?",
            "Mario just used this function but isn’t sure what will the function Math.ceil(-99.9) return?",
            "Mario is wondering which is actually right?",
            "Mario is getting worried when he is experiencing method overloading. Which of the following statement is true regarding method overloading?",
            "Mario is asking you to choose the correct option:",
            "Which statement is true for the class java.util.ArrayList?",
            "Mario is wondering if HashMap is a Collection class.",
            "Mario is asking which of these statements make logical sense",
            "Mario wants to use map interface however he doesn’t know how to use it. Which of the following is an implementation of Map interface:",


    };



    public String mChoices[][] = {
            {"Not Possible","Wrong Question","Yes it is possible","None of the above"},
            {"Linear Layout","Frame Layout","Table Layout","All of the above"},
            {"If it does background functionalities as services","If it reacts on broadcast announcements","If it passes data between activities","None of the above"},
            {"SQLite","Shared Preferences","Network dServers","All of the above"},
            {"0","10","2","100"},
            {"10 sec","5 sec","1 hour","It does not have a time limit"},
            {"Through Google search","log cat","It can’t be fixed","None of the above"},
            {"count()","sum()","length()","add()"},
            {"Intent","Toast","onRestart","EditText"},
            {"Linear Layout","Frame Layout","Absolute Layout","Relative Layout"},
            {"TIMESTAMP","DATETIME","DATE","None of the above"},
            {"mysql -h HostName -u -p","mysql -h -u -p","mysql -h HostName -u UserName -p ","None of the above"},
            {"SHOW table_name;","DESCRIBE table_name;","VIEW table_name;","None of the above"},
            {"blank space","NULL","Nothing","All of the above"},
            {"non-NULL values","values","string values","None of the above"},
            {"MM-DD-YYYY","YYYY-MM-DD","M-D-YY","None of the above"},
            {"NOT NULL","Table check","PRIMARY KEY","All of the above"},
            {"One","Two","Three","Four"},
            {"1994","1999","1997","1996"},
            {"True","False","Table does not have primary key","None of the above"},
            {"Programming Language","Platform","Both Programming Language and Platform","Abstract Machine"},
            {"C,C++,JAVA","C,JAVA,RUBY","C++,JAVA,BASIC","C++,JAVA,C#"},
            {"-99","99.0","100.0","-99.0"},
            {"Iterator i= HashMap.Iterator();","Iterator i= HashMap.entrySet().Iterator();","Nothing","Iterator i= HashMap.TreeSet().Iterator();"},
            {"Static methods cannot be overloaded","Overloaded methods should always return same type of value","Overloaded methods cannot be declared as abstract","Methods can be overloaded across inherited classes"},
            {"StringBuffer is a wrapper class","Integer is a wrapper class","Wrapper class contains no methods","String is a wrapper class"},
            {"The elements in the collection are ordered.","The collection is guaranteed to be immutable.","The elements in the collection are guaranteed to be unique.","The elements in the collection are accessed using a unique key."},
            {"True","False","Hashmap does not exist in Java","Neither"},
            {" An interface can implement another interface","An interface can be instantiated","All the methods of an interface are by default abstract"," An interface can contain concrete methods"},
            {"TreeSet","ArrayList","Hashtable","Vector"}

            };



    public String mCorrectAnswers[] = {
            "Yes it is possible",
            "All of the above",
            "If it reacts on broadcast announcements",
            "All of the above",
            "2",
            "10 sec",
            "log cat",
            "length()",
            "Toast",
    "Frame Layout",
            "DATETIME",
            "mysql -h HostName -u UserName -",
            "DESCRIBE table_name;",
            "NULL",
            "number of non-NULL values of a given expression",
            "YYYY-MM-DD",
            "Table check",
            "THREE",
            "1994",
            "False",
            "Both Programming Language and Platform",
            "C++,JAVA,C#",
            "-99.0",
            "Iterator i= HashMap.entrySet().Iterator();",
            "Methods can be overloaded across inherited classes",
            "Integer is a wrapper class",
            "The elements in the collection are ordered.",
            "TRUE",
            "All the methods of an interface are by default abstract",
            "Hashtable"
    };


    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
