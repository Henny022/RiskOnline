package de.henny022.RiskOnline.Territories;

import java.util.List;

/**
 * Created by henny on 24.09.16.
 */
public class Territory
{
    private TerritoryEnum territoryEnum;
    private String name;
    private String owner;
    private List<TerritoryEnum> neighbours;
    private int troupCount;

    public Territory(TerritoryEnum territoryEnum, String name, List<TerritoryEnum> neighbours)
    {
        this.territoryEnum = territoryEnum;
        this.name = name;
        this.owner = "none";
        this.neighbours = neighbours;
        this.troupCount = 0;
    }

    public TerritoryEnum getTerritoryEnum()
    {
        return territoryEnum;
    }

    public String getName()
    {
        return name;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public List<TerritoryEnum> getNeighbours()
    {
        return neighbours;
    }

    public void setTroupCount(int troupCount)
    {
        this.troupCount = troupCount;
    }

    public int getTroupCount()
    {
        return troupCount;
    }

    public boolean equals(Territory territory)
    {
        return this.territoryEnum.equals(territory.getTerritoryEnum());
    }
}
