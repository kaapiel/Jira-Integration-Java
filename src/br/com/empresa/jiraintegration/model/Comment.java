
package br.com.empresa.jiraintegration.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment {

    @SerializedName("comments")
    @Expose
    private List<Comment_> comments = null;
    @SerializedName("maxResults")
    @Expose
    private int maxResults;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("startAt")
    @Expose
    private int startAt;

    public List<Comment_> getComments() {
        return comments;
    }

    public void setComments(List<Comment_> comments) {
        this.comments = comments;
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

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

}
