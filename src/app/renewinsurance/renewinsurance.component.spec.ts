import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RenewinsuranceComponent } from './renewinsurance.component';

describe('RenewinsuranceComponent', () => {
  let component: RenewinsuranceComponent;
  let fixture: ComponentFixture<RenewinsuranceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RenewinsuranceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RenewinsuranceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
