package de.henny022.RiskOnline.Territories;

import java.util.List;

/**
 * Created by henny on 14.10.16.
 */
public class Territory
{
    private ETerritory eTerritory;
    private String name;
    private int troupCount;
    private String occupier;
    private List<ETerritory> neighbours;

    public Territory(ETerritory eTerritory, String name)
    {
        this.eTerritory = eTerritory;
        this.name = name;
        this.troupCount = 0;
        this.occupier = "Noone";
    }

    public void addNeighbour(ETerritory territory) {
        neighbours.add(territory);
    }

    public List<ETerritory> getNeighbours() {
        return neighbours;
    }

    public int modifyTroupCount(int difference)
    {
        troupCount = troupCount + difference;
        if (troupCount == 0) {
            troupCount = 0;
        }
        return troupCount;
    }

    public ETerritory geteTerritory()
    {
        return eTerritory;
    }

    public String getName()
    {
        return name;
    }

    public int getTroupCount()
    {
        return troupCount;
    }

    public void setTroupCount(int troupCount)
    {
        this.troupCount = troupCount;
    }

    public String getOccupier()
    {
        return occupier;
    }

    public void setOccupier(String occupier)
    {
        this.occupier = occupier;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object object)
    {
        if(object.getClass().equals(Territory.class))
        {
            return ((Territory) object).eTerritory == this.eTerritory;
        }
        else
        {
            return false;
        }
    }
}
