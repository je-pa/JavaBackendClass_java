package sec06.ch07;

public interface MyList {
	void add(int n); //public abstract
	void add(int idx, int n);
	int size();
	int get(int n);
	int remove();
	int remove(int idx);
}
