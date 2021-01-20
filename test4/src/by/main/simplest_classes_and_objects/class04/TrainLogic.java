package by.main.simplest_classes_and_objects.class04;

import java.util.ArrayList;

public class TrainLogic {
	public  ArrayList<Train> sortByTrainNumber(ArrayList<Train> trains){
		boolean check =false;
		while(!check) {
			check=true;
			Train max;
			for(int i=0;i<trains.size()-1;i++) {
				if(trains.get(i).getTrainNumber()>trains.get(i+1).getTrainNumber()) {
					check=false;
					max=trains.get(i);
					trains.set(i, trains.get(i+1));
					trains.set(i+1, max);

				}
			}
		}
		
		return trains;
	}
	
	
	
	public  ArrayList<Train> sortByDestination(ArrayList<Train> trains){
		boolean check =false;
		
		while(!check) {
			check=true;
			Train max;
			for(int i=0;i<trains.size()-1;i++) {
				if(trains.get(i).getDestination().compareTo(trains.get(i+1).getDestination())>0) {
					check=false;
					max=trains.get(i);
					trains.set(i, trains.get(i+1));
					trains.set(i+1, max);

				}
			}
		}
		return trains;
	}
		
	
	
	public  ArrayList<Train> sortByDepartureTime(ArrayList<Train> trains){	
		int countSameDestinations=0;
		int lastSameDestination=0;
		boolean check =false;
		TrainLogic n= new TrainLogic();
		n.sortByDestination(trains);
		
		for(int i=0;i<trains.size()-1;i++) {
			check =false;
			Train max;
			
			if(trains.get(i).getDestination().compareTo(trains.get(i+1).getDestination())==0) {
				countSameDestinations++;
			}
			
			else if(trains.get(i).getDestination().compareTo(trains.get(i+1).getDestination())!=0 || i==trains.size()-2){
				while(!check) {
					check=true;
					for(int j=lastSameDestination;j<countSameDestinations+lastSameDestination;j++) {
						if(trains.get(j).getDepartureTime() >trains.get(j+1).getDepartureTime()) {
							check=false;
							max=trains.get(j);
							trains.set(j, trains.get(j+1));
							trains.set(j+1, max);
						}
					}
				}
				lastSameDestination+=countSameDestinations+1;
				countSameDestinations=0;
			}
		}
		
			
			
		return trains;
	}
}
