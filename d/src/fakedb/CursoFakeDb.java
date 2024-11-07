package fakedb;

import java.util.ArrayList;

import dominio.Curso;

public class CursoFakeDb extends BaseFakeDb<Curso>
{

    @Override
    public ArrayList<Curso> PreencherDados()
    {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Curso(1, "C. Computação", 
        "Curso dos cria",40));
        return this.tabela;
    }
    public CursoFakeDb()
    {
        super();
    }
}