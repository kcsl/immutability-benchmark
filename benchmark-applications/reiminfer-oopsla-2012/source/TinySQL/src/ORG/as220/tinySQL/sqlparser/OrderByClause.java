package ORG.as220.tinySQL.sqlparser;

import ORG.as220.tinySQL.tinySQLException;

import java.util.ArrayList;
import java.util.Vector;
//import checkers.inference.ownership.quals.*;

public class OrderByClause
{
  private SelectStatement parent;
  private  /*@RepRep*/  ArrayList orderValues;
  private  /*@OwnOwn*/  ArrayList orderColumns;

  public OrderByClause(SelectStatement parent)
  {
    orderValues = new ArrayList();
    orderColumns = new ArrayList();
    this.parent = parent;
  }

  public void addLValue(LValue e) throws tinySQLException
  {
    Vector cols = ParserUtils.resolveTableColumns(
        e,
        ParserUtils.buildVector(parent.getTables())
    );

    orderColumns.addAll(cols);
    orderValues.add(e);
  }

  public ArrayList getColumns()
  {
    return orderColumns;
  }

  public ArrayList getValues()
  {
    return orderValues;
  }
}

