package com.test.social_poll.dto;

import com.test.social_poll.entity.Question;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PollDto {
    private Long id;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;

    public PollDto(Long id, String title, LocalDate startDate, LocalDate endDate, boolean isActive) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public PollDto() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PollDto pollDto = (PollDto) o;
        return isActive == pollDto.isActive &&
                Objects.equals(id, pollDto.id) &&
                Objects.equals(title, pollDto.title) &&
                Objects.equals(startDate, pollDto.startDate) &&
                Objects.equals(endDate, pollDto.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startDate, endDate, isActive);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "PollDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                '}';
    }
}
