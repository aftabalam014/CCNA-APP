package com.mdaftabalam.ccna.utils;

public class QuestionBank {

    // array of questions
    private String textQuestions[] = {
            "1. What are the advantages of Distributed Processing?",

            "2. What are the criteria necessary for an effective and efficient network?",

            "3. Name the factors that affect the performance of the network?",

            "4. Name the factors that affect the reliability of the network?",

            "5. Name the factors that affect the security of the network?",

            "6. What are the key elements of protocols?",

            "7. What are the key design issues of a computer Network?",

            "8. Name the categories of Multiplexing?",

            "9. The layers of OSI?",

            "10. Which layers are network support layers?",

            "11. Which layers are user support layers?",

            "12. What are the responsibilities of Data Link Layer?",

            "13. What are the responsibilities of Network Layer?",

            "14. What are the responsibilities of Transport Layer?",

            "15. What are the responsibilities of Session Layer?",

            "16. What are the responsibilities of Presentation Layer?",

            "17. What are the responsibilities of Application Layer?",

            "18. What are the different link types used to build a computer network?",

            "19. What are the types of errors?",

            "20. What are the two types of transmission technology available?",

            "21. Expand IDEA."
    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"Security database", "Distributed database", "Faster database", "Redundancy database"},

            {"Reliability", "Security", "Distributed", "No any one"},

            {"Number of Satellite", "Number of Seller", "Number of Vendor", "Number of Users"},

            {"Frequency of data", "Recovery of failure", "Frequency of failure", "Recovery of data"},

            {"Public Access", "Viruses", "Private Access", "Ip address"},

            {"Syntax", "Mantics", "Nameing", "No any one"},

            {"Effective", "Connectivity", "Services", "A and B"},

            {"FDM", "DDM", "MDM", "PDM"},

            {"Phycal Layer", "Link Layer", "Network Layer", "Parent Layer"},

            {"Physical Layer", "Link Layer", "Work Layers", "Parent Layers"},

            {"Session Layer", "Entation Layer", "Appcation Layer", "Jomata Layer"},

            {"Addressing", "Framing", "Control", "Access"},

            {"Routing", "Logical", "Addressing", "Effectiveing"},

            {"Service-point", "Segmentation", "Connection", "Flow"},

            {"Nization", "Control", "Dialog", "Synchronization"},

            {"Compresion", "Pression", "Translation", "Cryption"},

            {"Directory Services", "Services", "Transfer", "Network Terminal"},

            {"Wireless", "Last-Mile", "Cables", "Leased"},

            {"Double-Bit Error", "Single-Bit Error", "Crupt Error", "Multiple Error"},

            {"Broadcast and start-to-end", "Broadcast and end-to-start", "Broadcast and point-to-end", "Broadcast and point-to-point"},

            {"International Data Encryption Algorithm", "Inter Data Encryption Algebra", "Internal Data Encryption Algorithm", "Image Data End Algebra"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            "Distributed database", "Reliability", "Number of Users", "Frequency of failure","Viruses","Syntax","Connectivity",
            "FDM","Network Layer","Physical Layer","Session Layer","Framing","Routing","Segmentation","Synchronization","Translation",
            "Directory Services","Cables","Single-Bit Error","Broadcast and point-to-point","International Data Encryption Algorithm"
    };

    // method returns number of questions
    public int getLength() {
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        return textQuestions[a];
    }

    // method return a single multiple choice item for question based on array index of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        return multipleChoice[index][num - 1];
    }

    // method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        return mCorrectAnswers[a];
    }
}