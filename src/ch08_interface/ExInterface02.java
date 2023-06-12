package ch08_interface;

public class ExInterface02 {

	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		AsCenter as = new AsCenter();
		as.repair(t);
		as.repair(d);
		as.repair(m); 

	}

}
class AsCenter {

	void repair(Object r) {
		if (r instanceof Repairable) {
			
			System.out.println(r + " 가 수리 되었습니다");
		}	}

	
}




interface Repairable {}
class Unit {
	int hp;	final int MAX;
	Unit(int hp) {	this.hp = hp;		MAX = hp;	}}

class AirUnit extends Unit {
	AirUnit(int hp) {		super(hp);	}}
class GroundUnit extends Unit {
	GroundUnit(int hp) {		super(hp);	}}


class Tank extends GroundUnit implements Repairable {
	Tank() {		super(150);	}
	public String toString() {return "Tank";}}

class DropShip extends AirUnit implements Repairable {
	DropShip() {	super(125);	}
	public String toString() {	return "DropShip";	}}

class Marine    {
	public String toString() {		return "Marine";	}
}



