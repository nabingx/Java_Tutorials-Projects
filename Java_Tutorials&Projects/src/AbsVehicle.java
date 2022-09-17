
public abstract class AbsVehicle {
	abstract void go(); // kiểu abstract ko có body/{} mà phần body sẽ đc định nghĩa ở subclass hay các class con(child class) extends đến nó
						// ko thể tạo biến với kiểu AbsVehicle vì nó là kiểu abstract
}
