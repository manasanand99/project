import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstimateCalcinsuranceComponent } from './estimate-calcinsurance.component';

describe('EstimateCalcinsuranceComponent', () => {
  let component: EstimateCalcinsuranceComponent;
  let fixture: ComponentFixture<EstimateCalcinsuranceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EstimateCalcinsuranceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EstimateCalcinsuranceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
