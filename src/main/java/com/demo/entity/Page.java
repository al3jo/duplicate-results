package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "dt_page")
public class Page {
  @Id
  private Long id;
  private String name;
  private String action;
  private String description;

  @ManyToOne
  private Module module;


  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
    this.module.addPage(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Page page = (Page) o;
    return Objects.equals(name, page.name) &&
        Objects.equals(action, page.action) &&
        Objects.equals(description, page.description) &&
        Objects.equals(module, page.module);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, action, description, module);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Page{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", action='").append(action).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append(", module=").append(module);
    sb.append('}');
    return sb.toString();
  }

}
