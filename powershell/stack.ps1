class Stack
{
  [string[]] $items
  [int] $top
  [int] $size
  Stack([int] $size)
  {
    $this.items = [string[]]::new($size)
    $this.top = -1
    $this.size = $size
  }
  [bool] push([string] $item)
  {
    if ($this.top -eq $this.size - 1)
    {
      return $false
    }
    $this.top++
    $this.items[$this.top] = $item
    return $true
  }
  [bool] pop([ref] [string] $item)
  {
    if ($this.top -eq -1)
    {
      return $false
    }
    $item.Value = $this.items[$this.top]
    $this.top--
    return $true
  }
  [bool] peek([ref] [string] $item)
}
