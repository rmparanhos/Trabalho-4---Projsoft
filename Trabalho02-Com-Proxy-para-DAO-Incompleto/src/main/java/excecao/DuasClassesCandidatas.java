package excecao;

public class DuasClassesCandidatas extends RuntimeException
{
	private final static long serialVersionUID = 1;

	public DuasClassesCandidatas()
	{	super();
	}

	public DuasClassesCandidatas(String msg)
	{	super(msg);
	}
}	