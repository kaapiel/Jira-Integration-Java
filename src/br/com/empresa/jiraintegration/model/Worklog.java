
package br.com.empresa.jiraintegration.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Worklog {

    @SerializedName("startAt")
    @Expose
    private int startAt;
    @SerializedName("maxResults")
    @Expose
    private int maxResults;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("worklogs")
    @Expose
    private List<Object> worklogs = null;

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Object> getWorklogs() {
        return worklogs;
    }

    public void setWorklogs(List<Object> worklogs) {
        this.worklogs = worklogs;
    }

}
