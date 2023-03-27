package di;
//interface IWorker{
//	public void work();
//}

public class Worker  {
	public void work() {
		//working..
	}

}


class Manager{
	Worker worker;
	
	public void SetWorker(Worker w) {
		worker =w;
	}
	public void manage() {
		worker.work();
	
	}
}


class SuperWorker{
	public void work() {
		//..working much more
	}
}