package mypackage;

public class Factor {
public static int factor (int valore)
	{
	if (valore<=0) return 1;
	else return valore * factor(valore - 1);
	}
}
