package application.model;

public class Hotel {
	Client[] rooms;

	public Hotel(int roomsQt) {
		rooms = new Client[10];
	}

	public void Print() {
		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s%n", i, rooms[i]);
			}
		}
	}

	public void Rent(int roomNumber, Client client) throws Exception {
		if (rooms[roomNumber] == null)
			rooms[roomNumber] = client;
		else
			throw new Exception("Room already ocupied");
	}
}
