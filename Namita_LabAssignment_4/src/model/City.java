/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author namita
 */
public class City {
    String cityName;

    public String getCityName() {
        return "pune";
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    private ArrayList<Community> communityList;

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public City(){
        communityList = new ArrayList<>();
    }
    
    public Community addCommunity(Community community){
        communityList.add(community);
        return community;
    }
    
    
    
    public Community getCommunity(String community)
    {
        boolean flag =false;
    for(Community c: communityList)
    {
        
        if (c.getCommunityName().equalsIgnoreCase(community))
        {
            
        flag=true;
        return c;}
    }
    if(flag==false){
        Community c=new Community();
    return  c;}
    return null;
}
}
