package com.etiennelawlor.loop.network.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by etiennelawlor on 5/23/15.
 */
public class CommentsEnvelope {

    // region Fields
    @SerializedName("total")
    private int total;
    @SerializedName("page")
    private int page;
    @SerializedName("per_page")
    private int perPage;
    @SerializedName("paging")
    private Paging paging;
    @SerializedName("data")
    private List<Comment> comments;
    // endregion

    // region Getters

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public Paging getPaging() {
        return paging;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // endregion

    // region Setters

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    // endregion
}
