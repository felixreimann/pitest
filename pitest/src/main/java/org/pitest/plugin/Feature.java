package org.pitest.plugin;

public final class Feature {

  private final boolean onByDefault;
  private final String  name;
  private final String  description;

  private Feature(boolean onByDefault, String name, String description) {
    this.onByDefault = onByDefault;
    this.name = name;
    this.description = description;
  }

  public static Feature named(String name) {
    return new Feature(false, name, "");
  }

  public Feature withOnByDefault(boolean onByDefault) {
    return new Feature(onByDefault, this.name, this.description);
  }

  public Feature withDescription(String description) {
    return new Feature(this.onByDefault, this.name, description);
  }

  public String name() {
    return this.name;
  }

  public String description() {
    return this.description;
  }

  public boolean isOnByDefault() {
    return this.onByDefault;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result)
        + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Feature other = (Feature) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    return true;
  }

}
