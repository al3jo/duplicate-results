package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "dt_module")
public class Module {
  private Long id;
  private String label;
  private String displayName;
  private Set<Page> pages;

  @Id
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @OneToMany(mappedBy = "module")
  public Set<Page> getPages() {
    return pages;
  }

  public void setPages(Set<Page> pages) {
    this.pages = pages;
  }

  public void addPage(Page page) {
    if (pages == null) {
      pages = new HashSet<>();
    }
    pages.add(page);
    if (page.getModule() != this) {
      page.setModule(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Module module = (Module) o;
    return Objects.equals(label, module.label) && Objects.equals(displayName, module.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, displayName);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Module{");
    sb.append("id=").append(id);
    sb.append(", label='").append(label).append('\'');
    sb.append(", displayName='").append(displayName).append('\'');
    sb.append(", pages=").append(pages == null ? "null" : pages.size());
    sb.append('}');
    return sb.toString();
  }

}
