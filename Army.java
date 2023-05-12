import java.util.*;

public class Army{
    private static final List<ArmyRecord> armyRecords = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> createArmyRecord();
                case 2 -> showArmyRecord();
                case 3 -> updateArmyDetails();
                case 4 -> deleteArmyDetails();
                case 5 -> displayAllArmyDetails();
                case 6 -> armForceDetails();
                case 7 -> inventoryDetails();
                case 8 -> resourceManagement();
                case 9 -> personnelManagement();
                case 10 -> logisticsManagement();
                case 11 -> communicationAndInformationManagement();
                case 12 -> planningAndOperationsManagement();
                case 13 -> healthAndSafetyManagement();
                case 14 -> financialManagement();
                case 15 -> securityManagement();
                case 16 -> trainingAndCertificationManagement();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("----- Army Management System -----");
        System.out.println("1. Create Records for a new Army");
        System.out.println("2. Show Army Records using Index");
        System.out.println("3. Update Army Details");
        System.out.println("4. Delete Army Details");
        System.out.println("5. Display all Army Details");
        System.out.println("6. Arm Force Details");
        System.out.println("7. Inventory Details");
        System.out.println("8. Resource Management");
        System.out.println("9. Personnel Management");
        System.out.println("10. Logistics Management");
        System.out.println("11. Communication and Information Management");
        System.out.println("12. Planning And Operations Management");
        System.out.println("13. Health and Safety Management");
        System.out.println("14. Financial Management");
        System.out.println("15. Security Management");
        System.out.println("16. Training and Certification Management");
        System.out.println("0. Exit");
    }
    private static void planningAndOperationsManagement() {
        System.out.println("----- Planning and Operations Management -----");
        
        System.out.println("1. Create Operation Plan");
        System.out.println("2. Update Operation Plan");
        System.out.println("3. Delete Operation Plan");
        System.out.println("4. View Operation Plans");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1 -> createOperationPlan();
            case 2 -> updateOperationPlan();
            case 3 -> deleteOperationPlan();
            case 4 -> viewOperationPlans();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void createOperationPlan() {
        System.out.println("----- Create Operation Plan -----");
        
        System.out.print("Enter Operation Name: ");
        String operationName = scanner.nextLine();
        
        System.out.println("Operation Plan created: " + operationName);
    }
    
    private static void updateOperationPlan() {
        System.out.println("----- Update Operation Plan -----");
        
        System.out.print("Enter Operation Name to update: ");
        String operationName = scanner.nextLine();
        
        System.out.println("Operation Plan updated: " + operationName);
    }
    
    private static void deleteOperationPlan() {
        System.out.println("----- Delete Operation Plan -----");
        
        System.out.print("Enter Operation Name to delete: ");
        String operationName = scanner.nextLine();
        
        System.out.println("Operation Plan deleted: " + operationName);
    }
    
    private static void viewOperationPlans() {
        System.out.println("----- View Operation Plans -----");
        
        
        System.out.println("Operation Plans:");
        System.out.println("1. Operation Plan A");
        System.out.println("2. Operation Plan B");
        System.out.println("3. Operation Plan C");
    }
    
    private static void communicationAndInformationManagement() {
        System.out.println("----- Communication and Information Management -----");
        
        System.out.println("Performing communication and information management operations...");
        
        // Example operations
        System.out.println("1. Send message");
        System.out.println("2. Receive message");
        System.out.println("3. Update communication settings");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1 -> sendMessage();
            case 2 -> receiveMessage();
            case 3 -> updateCommunicationSettings();
            default -> System.out.println("Invalid choice. Returning to main menu.");
        }
    }
    
    private static void sendMessage() {
        System.out.println("Sending message...");
        // Code to send a message
    }
    
    private static void receiveMessage() {
        System.out.println("Receiving message...");
        // Code to receive a message
    }
    
    private static void updateCommunicationSettings() {
        System.out.println("Updating communication settings...");
        // Code to update communication settings
    }
    
    private static void healthAndSafetyManagement() {
        System.out.println("----- Health and Safety Management -----");
        System.out.println("1. Report Incident");
        System.out.println("2. View Incidents");
        System.out.println("3. Update Incident Status");
        System.out.println("4. Conduct Safety Training");
        System.out.println("5. Exit Health and Safety Management");
    
        int choice = -1;
        while (choice != 5) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> reportIncident();
                case 2 -> viewIncidents();
                case 3 -> updateIncidentStatus();
                case 4 -> conductSafetyTraining();
                case 5 -> System.out.println("Exiting Health and Safety Management...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
    
            System.out.println();
        }
    }
    
    private static void reportIncident() {
        System.out.print("Enter the details of the incident: ");
    
        System.out.println("Incident reported successfully!");
    }
    
    private static void viewIncidents() {
        System.out.println("----- Incident List -----");
        System.out.println("1. Incident 1");
        System.out.println("2. Incident 2");
        System.out.println("3. Incident 3");
    }
    
    private static void updateIncidentStatus() {
        System.out.print("Enter the incident ID to update: ");
        int incidentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    
        System.out.println("Incident " + incidentId + " status updated successfully!");
    }
    
    private static void conductSafetyTraining() {
        System.out.println("Conducting safety training...");
    }
    

    private static void securityManagement() {
        System.out.println("----- Security Management -----");
        
        
        System.out.println("Performing security checks...");
        System.out.println("Access control: Verified");
        System.out.println("System integrity: Verified");
        
        // Prompt for additional security tasks
        System.out.println("What additional security tasks would you like to perform?");
        System.out.println("1. Monitor surveillance cameras");
        System.out.println("2. Review access logs");
        System.out.println("3. Conduct security training");
        System.out.println("4. Perform security audit");
        System.out.println("0. Exit");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Monitoring surveillance cameras...");
                // Perform monitoring tasks
                System.out.println("Camera 1: No suspicious activities detected");
                System.out.println("Camera 2: No suspicious activities detected");
                System.out.println("Camera 3: Detected movement near restricted area");
            }
            case 2 -> {
                System.out.println("Reviewing access logs...");
                // Perform log review tasks
                System.out.println("Access Log 1: User 'John' accessed restricted file");
                System.out.println("Access Log 2: User 'Sarah' attempted unauthorized login");
            }
            case 3 -> {
                System.out.println("Conducting security training...");
                // Perform security training tasks
                System.out.println("Training Session 1: Introduction to security protocols");
                System.out.println("Training Session 2: Handling confidential information");
            }
            case 4 -> {
                System.out.println("Performing security audit...");
                // Perform security audit tasks
                System.out.println("Audit Result: Security vulnerabilities identified in network infrastructure");
            }
            case 0 -> System.out.println("Returning to main menu...");
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void trainingAndCertificationManagement() {
        System.out.println("----- Training and Certification Management -----");
        System.out.println("1. Schedule Training");
        System.out.println("2. Register for Training");
        System.out.println("3. View Training Schedule");
        System.out.println("4. View Registered Trainings");
        System.out.println("5. Complete Training");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> scheduleTraining();
            case 2 -> registerForTraining();
            case 3 -> viewTrainingSchedule();
            case 4 -> viewRegisteredTrainings();
            case 5 -> completeTraining();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void scheduleTraining() {
        System.out.println("Training scheduled successfully!");
    }
    
    private static void registerForTraining() {
        System.out.println("Registered for training successfully!");
    }
    
    private static void viewTrainingSchedule() {
        System.out.println("----- Training Schedule -----");
        System.out.println("Date: 2023-05-15");
        System.out.println("Time: 10:00 AM");
        System.out.println("Topic: Leadership Skills");
    }
    
    private static void viewRegisteredTrainings() {
        System.out.println("----- Registered Trainings -----");
        System.out.println("1. Leadership Skills (2023-05-15)");
    }
    
    private static void completeTraining() {
        System.out.println("Training marked as completed!");
    }
    

    private static void createArmyRecord() {
        System.out.print("Enter Army Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Army Location: ");
        String location = scanner.nextLine();

        ArmyRecord record = new ArmyRecord(name, location);
        armyRecords.add(record);

        System.out.println("Army record created successfully!");
    }

    private static void showArmyRecord() {
        System.out.print("Enter the index of the army record to show: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < armyRecords.size()) {
            ArmyRecord record = armyRecords.get(index);
            System.out.println("Army Name: " + record.getName());
            System.out.println("Army Location: " + record.getLocation());
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void updateArmyDetails() {
        System.out.print("Enter the index of the army record to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (index >= 0 && index < armyRecords.size()) {
            ArmyRecord record = armyRecords.get(index);
            System.out.println("Current Army Name: " + record.getName());
            System.out.print("Enter new Army Name: ");
            String name = scanner.nextLine();
            System.out.println("Current Army Location: " + record.getLocation());
            System.out.print("Enter new Army Location: ");
            String location = scanner.nextLine();

            record.setName(name);
            record.setLocation(location);

            System.out.println("Army details updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void deleteArmyDetails() {
        System.out.print("Enter the index of the army record to delete: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < armyRecords.size()) {
            armyRecords.remove(index);
            System.out.println("Army record deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void displayAllArmyDetails() {
        if (armyRecords.isEmpty()) {
            System.out.println("No army records found.");
        } else {
            System.out.println("----- All Army Details -----");
            for (int i = 0; i < armyRecords.size(); i++) {
                ArmyRecord record = armyRecords.get(i);
                System.out.println("Index: " + i);
                System.out.println("Army Name: " + record.getName());
                System.out.println("Army Location: " + record.getLocation());
                System.out.println();
            }
        }
    }

    private static void armForceDetails() {
        System.out.println("----- Arm Force Details -----");
    
        // 1. List Units
        List<String> units = getUnits(); // Implement the logic to retrieve the units
        System.out.println("Units: " + units);
    
        // 2. Rank Distribution
        Map<String, Integer> rankDistribution = getRankDistribution(); // Implement the logic to calculate the rank distribution
        System.out.println("Rank Distribution: " + rankDistribution);
    
        // 3. Equipment Inventory
        List<String> equipmentInventory = getEquipmentInventory(); // Implement the logic to retrieve the equipment inventory
        System.out.println("Equipment Inventory: " + equipmentInventory);
    
        // 4. Training Programs
        List<String> trainingPrograms = getTrainingPrograms(); // Implement the logic to retrieve the training programs
        System.out.println("Training Programs: " + trainingPrograms);
    
        // 5. Recent Operations
        List<String> recentOperations = getRecentOperations(); // Implement the logic to retrieve the recent operations
        System.out.println("Recent Operations: " + recentOperations);
    
    }
    
    private static void financialManagement() {
        System.out.println("----- Financial Management -----");
        System.out.println("1. Budget Planning and Forecasting");
        System.out.println("2. Expense Tracking and Reporting");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> budgetPlanningAndForecasting();
            case 2 -> expenseTrackingAndReporting();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void budgetPlanningAndForecasting() {
        System.out.println("----- Budget Planning and Forecasting -----");
        double projectedRevenue = 50000.0;
        double estimatedExpenses = 40000.0;
        double financialTarget = 10000.0;
    
        System.out.println("Projected Revenue: $" + projectedRevenue);
        System.out.println("Estimated Expenses: $" + estimatedExpenses);
        System.out.println("Financial Target: $" + financialTarget);
    }
    
    private static void expenseTrackingAndReporting() {
        System.out.println("----- Expense Tracking and Reporting -----");
        double[] expenses = { 5000.0, 3000.0, 2000.0, 4000.0, 6000.0 };
        double totalExpenses = 0.0;
    
        System.out.println("Expense Tracking Report:");
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
            totalExpenses += expenses[i];
        }
        System.out.println("Total Expenses: $" + totalExpenses);
    }
    

    private static void logisticsManagement() {
        System.out.println("----- Logistics Management -----");
        System.out.println("1. Data analytics and predictive modeling");
        System.out.println("2. Cybersecurity measures");
        System.out.println("3. Training and awareness");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> dataAnalyticsAndPredictiveModeling();
            case 2 -> cybersecurityMeasures();
            case 3 -> trainingAndAwareness();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void dataAnalyticsAndPredictiveModeling() {
        System.out.println("----- Data Analytics and Predictive Modeling -----");
    }
    
    private static void cybersecurityMeasures() {
        System.out.println("----- Cybersecurity Measures -----");
    }
    
    private static void trainingAndAwareness() {
        System.out.println("----- Training and Awareness -----");
    }
    
    private static List<String> getUnits() {
        List<String> units = new ArrayList<>();
        units.add("Unit A");
        units.add("Unit B");
        return units;
    }
    
    private static Map<String, Integer> getRankDistribution() {
        Map<String, Integer> rankDistribution = new HashMap<>();
        rankDistribution.put("Rank A", 10);
        rankDistribution.put("Rank B", 15);
        rankDistribution.put("Rank C", 20);
        return rankDistribution;
    }
    
    private static List<String> getEquipmentInventory() {
        List<String> equipmentInventory = new ArrayList<>();
        equipmentInventory.add("Equipment A");
        equipmentInventory.add("Equipment B");
        return equipmentInventory;
    }
    
    private static List<String> getTrainingPrograms() {
        List<String> trainingPrograms = new ArrayList<>();
        trainingPrograms.add("Training Program A");
        trainingPrograms.add("Training Program B");
        return trainingPrograms;
    }
    
    private static List<String> getRecentOperations() {
        List<String> recentOperations = new ArrayList<>();
        recentOperations.add("Operation A");
        recentOperations.add("Operation B");
        return recentOperations;
    }
    

    private static void inventoryDetails() {
        List<InventoryItem> inventoryItems = new ArrayList<>();
        inventoryItems.add(new InventoryItem("Item 1", 10, 20.99, "Description 1"));
        inventoryItems.add(new InventoryItem("Item 2", 5, 15.49, "Description 2"));
        inventoryItems.add(new InventoryItem("Item 3", 8, 5.99, "Description 3"));
    
        System.out.println("----- Inventory Details -----");
        for (InventoryItem item : inventoryItems) {
            System.out.println("Item Name: " + item.name());
            System.out.println("Quantity: " + item.quantity());
            System.out.println("Price: $" + item.price());
            System.out.println("Description: " + item.description());
            System.out.println();
        }
    }
    private static void personnelManagement() {
        System.out.println("----- Personnel Management -----");
        System.out.println("1. Specialized Training");
        System.out.println("2. Leadership Development");
        System.out.println("3. Continuous Learning Programs");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("----- Specialized Training -----");
                System.out.println("Select the type of specialized training:");
                System.out.println("1. Combat Training");
                System.out.println("2. Intelligence Analysis");
                System.out.println("3. Logistics Management");
                System.out.println("4. Technical Expertise");
                System.out.print("Enter your choice: ");
                int specializedTrainingChoice = scanner.nextInt();
                switch (specializedTrainingChoice) {
                    case 1 -> System.out.println("Implementing Combat Training...");
                    case 2 -> System.out.println("Implementing Intelligence Analysis Training...");
                    case 3 -> System.out.println("Implementing Logistics Management Training...");
                    case 4 -> System.out.println("Implementing Technical Expertise Training...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
            case 2 -> {
                System.out.println("----- Leadership Development -----");
                System.out.println("Implementing Leadership Development Programs...");
            }
            case 3 -> {
                System.out.println("----- Continuous Learning Programs -----");
                System.out.println("Implementing Continuous Learning Programs...");
            }
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void resourceManagement() {
        System.out.println("----- Resource Management -----");
        System.out.println("1. Resource Allocation");
        System.out.println("2. Maintenance and Repair");
        System.out.print("Enter your choice: ");
        int resourceChoice = scanner.nextInt();
        scanner.nextLine();

        switch (resourceChoice) {
            case 1 -> resourceAllocation();
            case 2 -> maintenanceAndRepair();
            default -> System.out.println("Invalid choice. Returning to main menu.");
        }
    }
    
    private static void resourceAllocation() {
        System.out.println("----- Resource Allocation -----");
    }
    
    private static void maintenanceAndRepair() {
        System.out.println("----- Maintenance and Repair -----");
    }


    private record InventoryItem(String name, int quantity, double price, String description) {

        @Override
            public boolean equals(Object obj) {
                if (obj == this) return true;
                if (obj == null || obj.getClass() != this.getClass()) return false;
                var that = (InventoryItem) obj;
                return Objects.equals(this.name, that.name) &&
                        this.quantity == that.quantity &&
                        Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price) &&
                        Objects.equals(this.description, that.description);
            }

        @Override
            public String toString() {
                return "InventoryItem[" +
                        "name=" + name + ", " +
                        "quantity=" + quantity + ", " +
                        "price=" + price + ", " +
                        "description=" + description + ']';
            }

    }
    

    private static class ArmyRecord {
        private String name;
        private String location;

        public ArmyRecord(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}

