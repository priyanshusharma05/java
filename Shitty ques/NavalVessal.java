import java.util.Scanner;

class NavalVessel {
    // Attributes
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification; // Derived attribute

    // Constructor
    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    // Getters
    public int getVesselId() {
        return vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getClassification() {
        return classification;
    }

    // Setters
    public void setClassification(String classification) {
        this.classification = classification;
    }
}

class Solution {

    // Method to find the average voyages completed based on the percentage condition
    public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int totalCompletedVoyages = 0;
        int count = 0;

        for (NavalVessel vessel : vessels) {
            if (vessel.getNoOfVoyagesPlanned() > 0) {
                int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct >= percentage) {
                    totalCompletedVoyages += vessel.getNoOfVoyagesCompleted();
                    count++;
                }
            }
        }
        
        if (count == 0) {
            return 0;
        }
        return (double) totalCompletedVoyages / count;
    }

    // Method to find a vessel by purpose and assign classification based on voyage percentage
    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                if (vessel.getNoOfVoyagesPlanned() > 0) {
                    int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                    String classification = getClassification(pct);
                    vessel.setClassification(classification);
                    return vessel;
                }
            }
        }
        return null;
    }

    // Helper method to determine classification
    private static String getClassification(int percentage) {
        if (percentage == 100) {
            return "Star";
        } else if (percentage >= 80 && percentage < 100) {
            return "Leader";
        } else if (percentage >= 55 && percentage < 80) {
            return "Inspirer";
        } else {
            return "Striver";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading NavalVessel objects
        NavalVessel[] vessels = new NavalVessel[4];
        for (int i = 0; i < 4; i++) {
            int vesselId = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            String vesselName = sc.nextLine();
            int noOfVoyagesPlanned = sc.nextInt();
            int noOfVoyagesCompleted = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            String purpose = sc.nextLine();
            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        // Read percentage and purpose
        int percentage = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        String purpose = sc.nextLine();

        // Calling findAvgVoyagesByPct
        double avgVoyages = findAvgVoyagesByPct(vessels, percentage);
        if (avgVoyages > 0) {
            System.out.println((int) avgVoyages);
        } else {
            System.out.println("No Naval Vessel is available with the specified percentage");
        }

        // Calling findVesselByGrade
        NavalVessel vessel = findVesselByGrade(vessels, purpose);
        if (vessel != null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        sc.close();
    }
}